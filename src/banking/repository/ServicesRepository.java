package banking.repository;

import banking.entity.UserEntity;

import java.util.List;

public interface ServicesRepository {

    List<UserEntity> getUsers();

    String register(
            String firstname,
            String lastname,
            String phoneNumber,
            String address
    );

    void fillBalance(
            String amount
    );

}
