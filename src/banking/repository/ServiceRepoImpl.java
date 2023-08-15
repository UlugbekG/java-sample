package banking.repository;

import banking.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ServiceRepoImpl implements ServicesRepository {

    private final ArrayList<UserEntity> userList = new ArrayList<>();

    @Override
    public List<UserEntity> getUsers() {
        return userList;
    }

    @Override
    public String register(
            String firstname,
            String lastname,
            String phoneNumber,
            String address
    ) {

        UserEntity user = userList.stream()
                .filter(userEntity -> userEntity.getPhoneNumber().equals(phoneNumber))
                .findFirst()
                .orElse(null);

        if (user == null) {

            UUID uuid = UUID.randomUUID();
            UserEntity newUser = new UserEntity(
                    uuid.toString(),
                    firstname,
                    lastname,
                    phoneNumber,
                    address
            );

            userList.add(newUser);

            return "User successfully added!";
        } else {
            return "User with this" + phoneNumber + "exists please add with another number!";
        }
    }

    @Override
    public void fillBalance(String amount) {

    }

}
