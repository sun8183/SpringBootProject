package com.sun.springBoot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest /* H2 데이터베이스 자동실행  */
public class PostRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After /* 단위테스트가 끝날 때 실행 */
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void saveBoard(){
        String title = "게시글 제목";
        String content = "테스트 본문";

        /* save : ID 존재할시 update, ID 없을 시 Insert */
        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("4sunskyhyun@gmail.com")
                .build());

        List<Posts> postsList = postsRepository.findAll(); /* 모든데이터 조회  */

        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);


    }
}
