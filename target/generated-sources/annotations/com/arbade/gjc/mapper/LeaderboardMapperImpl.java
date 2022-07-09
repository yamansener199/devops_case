package com.arbade.gjc.mapper;

import com.arbade.gjc.model.dto.response.LeaderboardResponseDto;
import com.arbade.gjc.model.entity.Leaderboard;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-09T17:41:22+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class LeaderboardMapperImpl implements LeaderboardMapper {

    @Override
    public Leaderboard map(LeaderboardResponseDto leaderboardResponseDto) {
        if ( leaderboardResponseDto == null ) {
            return null;
        }

        Leaderboard leaderboard = new Leaderboard();

        leaderboard.setDisplayName( leaderboardResponseDto.getDisplayName() );
        leaderboard.setCountry( leaderboardResponseDto.getCountry() );
        leaderboard.setPoints( leaderboardResponseDto.getPoints() );
        if ( leaderboardResponseDto.getRank() != null ) {
            leaderboard.setRank( Long.parseLong( leaderboardResponseDto.getRank() ) );
        }

        return leaderboard;
    }

    @Override
    public LeaderboardResponseDto mappertoDto(Leaderboard leaderboard) {
        if ( leaderboard == null ) {
            return null;
        }

        LeaderboardResponseDto leaderboardResponseDto = new LeaderboardResponseDto();

        leaderboardResponseDto.setRank( String.valueOf( leaderboard.getRank() ) );
        leaderboardResponseDto.setPoints( (long) leaderboard.getPoints() );
        leaderboardResponseDto.setDisplayName( leaderboard.getDisplayName() );
        leaderboardResponseDto.setCountry( leaderboard.getCountry() );

        return leaderboardResponseDto;
    }
}
