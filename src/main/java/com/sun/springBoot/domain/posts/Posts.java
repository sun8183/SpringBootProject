package com.sun.springBoot.domain.posts;

import com.sun.springBoot.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor /* 기본생성자 자동추가 */
@Entity
public class Posts extends BaseTimeEntity { /* Entity 클래스 (실제 쿼리를 날리기 보단 Entity 에서의 수정, 삭제 )*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* pk */
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder    /* 해당클래스의 빌더 패턴 클래스 생성 */
   public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
       this.title = title;
       this.content = content;
    }
}
