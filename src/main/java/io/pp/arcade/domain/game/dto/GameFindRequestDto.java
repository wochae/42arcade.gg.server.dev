package io.pp.arcade.domain.game.dto;

import lombok.Getter;
import reactor.util.annotation.Nullable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
public class GameFindRequestDto {
    @Max(100)
    @Min(1)
    @Nullable
    Integer count;

    @Max(Integer.MAX_VALUE)
    @Min(1)
    @Nullable
    Integer gameId;
    
    String status;
}
