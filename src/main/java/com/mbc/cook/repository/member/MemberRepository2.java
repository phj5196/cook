package com.mbc.cook.repository.member;

import com.mbc.cook.entity.member.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MemberRepository2 extends JpaRepository<MemberEntity,String> {
    @Transactional
    @Query(value = "select id from usermember where id = :id", nativeQuery = true)
    String idcheck(@Param("id") String id);

    @Transactional
    @Query(value = "select pw from usermember where id=:id",nativeQuery = true)
    String pwchk(@Param("id") String id);
}
