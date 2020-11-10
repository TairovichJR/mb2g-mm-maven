package com.tairovich.mappers;

import com.tairovich.User;
import com.tairovich.domain.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    public static final UserMapper INSTANCE =Mappers.getMapper(UserMapper.class);

    User userCommandtoUser(UserCommand userCommand);

    UserCommand userToUserCommand(User user);
}
