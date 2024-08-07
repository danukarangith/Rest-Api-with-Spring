package lk.ijse.demo1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Blog {
    @Id
    private int id ;
    private String title ;
    private String category;
    private String content;
}
