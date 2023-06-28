package sample.design.comportement.observer.correction;

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
