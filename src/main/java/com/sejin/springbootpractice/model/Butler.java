package com.sejin.springbootpractice.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.sejin.springbootpractice.model.Cat;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Butler {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "butler")
    private List<Cat> catList = new ArrayList<>();

    public void addCat(final Cat cat) {
        cat.setButler(this); // 주인님(Cat), 저(Butler) 왔어요!
        catList.add(cat); // Butler와 Cat 사이의 관계에서는 이 부분은 생략해도 무방하나, 같은 영속성 범위 안에서 Butler를 계속 쓰려 할 때 예상치 못한 버그가 튀어나올 수 있으니, 이 부분을 항상 작성해줘야 한다.
    }
}
