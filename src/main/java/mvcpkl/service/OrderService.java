package mvcpkl.service;

import mvcpkl.entities.OrderEntity;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

public interface OrderService {
    void orderProduct(HttpSession session, Principal principal);
    List<OrderEntity> listOrder (String username);
    List<OrderEntity> adminGetListOrder ();
    void deleteOrder(int id);
}
