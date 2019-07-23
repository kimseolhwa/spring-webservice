package com.demo.webservice.domain.posts;

import com.demo.webservice.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
/*@SequenceGenerator(
        name="POSTS_SEQ_GEN", //시퀀스 제너레이터 이름
        sequenceName="POSTS_SEQ", //시퀀스 이름
        initialValue=3, //시작값
        allocationSize=1 //메모리를 통해 할당할 범위 사이즈
)*/
public class Posts extends BaseTimeEntity {

    @Id
    /*@GeneratedValue(
            strategy=GenerationType.SEQUENCE, //사용할 전략을 시퀀스로  선택
            generator="POSTS_SEQ_GEN" //식별자 생성기를 설정해놓은  POSTS_SEQ_GEN으로 설정
    )*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}