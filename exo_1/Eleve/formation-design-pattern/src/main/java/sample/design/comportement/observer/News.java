package sample.design.comportement.observer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class News {

    private String title;

    private String content;

    private Date createdDate;
}
