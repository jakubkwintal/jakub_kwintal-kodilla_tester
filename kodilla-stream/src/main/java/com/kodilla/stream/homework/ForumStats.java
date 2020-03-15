package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOfPosts1 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();
        System.out.println(avgOfPosts1);

        double avgOfPosts2 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();
        System.out.println(avgOfPosts2);
    }
}