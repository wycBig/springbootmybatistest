package com.offcn.springbootmybatistest.mapper;

import com.offcn.springbootmybatistest.eneity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonMapper {


    List<Person> getAll();
}
