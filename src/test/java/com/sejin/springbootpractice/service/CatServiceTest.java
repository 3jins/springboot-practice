package com.sejin.springbootpractice.service;

import com.sejin.springbootpractice.dto.req.CatRequestDto;
import com.sejin.springbootpractice.model.Cat;
import com.sejin.springbootpractice.repository.CatRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.BDDMockito.given;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CatServiceTest {

    @MockBean
    private CatRepository catRepositoryMockBean;

    @SpyBean
    private CatRepository catRepositorySpyBean;

    /**
     * A test method for `getCatList`
     * An example of MockBean
     */
    @Test
    public void getCatListShouldReturnEmptyListWhenInexistentKindIsGiven() {
        // given
        String inexistentKind = "tomcat";
        given(catRepositoryMockBean.findByKind(inexistentKind))
                .willReturn(new ArrayList<>());
        CatService catService = new CatService(catRepositoryMockBean);

        // when
        List<Cat> result = catService.getCatList(CatRequestDto.builder()
                .kind(inexistentKind).build());

        // then
        assert(result.size() == 0);
    }
}
