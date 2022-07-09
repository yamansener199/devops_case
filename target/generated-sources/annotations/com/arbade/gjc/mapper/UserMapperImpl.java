package com.arbade.gjc.mapper;

import com.arbade.gjc.model.dto.request.UserRequestDto;
import com.arbade.gjc.model.dto.response.UserResponseDto;
import com.arbade.gjc.model.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-09T17:41:22+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User map(UserRequestDto userRequestDto) {
        if ( userRequestDto == null ) {
            return null;
        }

        User user = new User();

        user.setDisplayName( userRequestDto.getDisplayName() );
        user.setCountry( userRequestDto.getCountry() );

        return user;
    }

    @Override
    public UserResponseDto mapToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.set_id( user.get_id() );
        userResponseDto.setDisplayName( user.getDisplayName() );
        userResponseDto.setPoints( user.getPoints() );

        return userResponseDto;
    }
}
