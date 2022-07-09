package com.arbade.gjc.mapper;

import com.arbade.gjc.model.dto.request.ScoreRequestDto;
import com.arbade.gjc.model.entity.Score;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-09T17:41:22+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class ScoreMapperImpl implements ScoreMapper {

    @Override
    public Score map(ScoreRequestDto scoreRequestDto) {
        if ( scoreRequestDto == null ) {
            return null;
        }

        Score score = new Score();

        score.set_id( scoreRequestDto.get_id() );
        score.setScoreWorth( scoreRequestDto.getScoreWorth() );

        return score;
    }
}
