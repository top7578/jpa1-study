package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded   //내장타입이다 둘 중 하나만 있어도 된다
    private Address address;

    @OneToMany(mappedBy = "member") //order Entity에 있는 member 변수에 매핑됨 (가짜 매핑)
    private List<Order> orders = new ArrayList<>();

}
