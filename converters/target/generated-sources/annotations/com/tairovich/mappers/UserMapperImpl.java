package com.tairovich.mappers;

import com.tairovich.User;
import com.tairovich.domain.UserCommand;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-09T20:36:40-0500",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.9 (Oracle Corporation)"
)
*/
public class UserMapperImpl implements UserMapper {

    @Override
    public User userCommandtoUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userCommand.getFirstName() );
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }
}
