package com.fardo.vedio.dao;

import org.springframework.data.repository.CrudRepository;

import com.fardo.vedio.bean.TmpJpaUser;

public interface TmpJpaUserDao extends CrudRepository<TmpJpaUser, String> {

}
