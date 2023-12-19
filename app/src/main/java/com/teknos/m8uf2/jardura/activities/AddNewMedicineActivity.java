package com.teknos.m8uf2.jardura.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.databinding.ActivityAddNewMedicineBinding;
import com.teknos.m8uf2.jardura.entitats.Medicaments;
import com.teknos.m8uf2.jardura.handlers.AddMedsClickHandler;
import com.teknos.m8uf2.jardura.view.AppViewModel;

import java.io.IOException;

public class AddNewMedicineActivity extends AppCompatActivity {

    private ActivityAddNewMedicineBinding binding;
    private AddMedsClickHandler handler;
    private Medicaments medicaments;

    private static int REQUEST_GALERY = 12;
    private static int PERMISSION_REQUEST_GALERY = 13;
    private static int REQUEST_CAMERA = 11;
    private static int PERMISSION_REQUEST_CAMERA = 43;
    private ImageView medImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_medicine);

        medicaments = new Medicaments();

        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_new_medicine);

        // View Model
        AppViewModel appViewModel = new ViewModelProvider(this).get(AppViewModel.class);

        handler = new AddMedsClickHandler(medicaments, this, appViewModel);

        binding.setMedicina(medicaments);
        binding.setClickHandler(handler);

        medImageView = findViewById(R.id.medImageView);
    }

    public void onCaptureOpenGallery(View view) {
        onCaptureGallery();

    }

    public void onCaptureTakePhoto(View view) {
        onCaptureCamera();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == PERMISSION_REQUEST_CAMERA) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                onCaptureCamera();

            } else {


            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CAMERA) {
            if (resultCode == RESULT_OK) {
                Bitmap photo = (Bitmap) data.getExtras().get("data");
                this.medImageView.setImageBitmap(photo);

            } else if (resultCode == RESULT_CANCELED) {


            }
        } else if (requestCode == REQUEST_GALERY) {
            if (resultCode == RESULT_OK) {
                Uri imageUri = data.getData();
                try {
                    Bitmap photo = (Bitmap) MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                    this.medImageView.setImageBitmap(photo);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (resultCode == RESULT_CANCELED) {

            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void onCaptureGallery(){
        if (checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED ) {
            Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(i, REQUEST_GALERY);

        }

        else{
            this.requestPermissions(new  String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSION_REQUEST_GALERY);
        }
    }

    public void onCaptureCamera(){
        if (checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED ) {
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i, REQUEST_CAMERA);

        }
        else{
            this.requestPermissions(new  String[]{Manifest.permission.CAMERA}, PERMISSION_REQUEST_CAMERA);
        }
    }
}