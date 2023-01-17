package practice.docker.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "POST")
public class PostEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;
}
