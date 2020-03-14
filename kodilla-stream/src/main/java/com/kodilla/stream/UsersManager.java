package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUsersList()
//                UsersRepository.getUsersList()
                .stream()
//            .map(u -> u.getUsername())
                .filter(u-> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
//                .forEach(un -> System.out.println(un));
        .collect(Collectors.toList());
        System.out.println(usernames);


    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
