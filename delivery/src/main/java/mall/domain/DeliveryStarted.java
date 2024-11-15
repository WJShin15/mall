package mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String userId;
    private String productId;
    private Integer qty;
    private String status;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
