package com.kaoqin.mapper;

import com.kaoqin.pojo.Kaoqin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface GuanliMapper {
    List<Kaoqin> qurryGuanli();
}
