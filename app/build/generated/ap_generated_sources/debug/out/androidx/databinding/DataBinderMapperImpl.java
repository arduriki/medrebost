package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.teknos.m8uf2.jardura.DataBinderMapperImpl());
  }
}
