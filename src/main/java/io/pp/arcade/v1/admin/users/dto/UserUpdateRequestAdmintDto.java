package io.pp.arcade.v1.admin.users.dto;

import io.pp.arcade.v1.global.type.RacketType;
import lombok.Getter;

@Getter
public class UserUpdateRequestAdmintDto {
    private Integer userId;
    private String intraId;
    private RacketType racketType;
    private String statusMessage;
    private Integer wins;
    private Integer losses;
    private Integer ppp;
    private String eMail;
    private String roleType;

    @Override
    public String toString() {
        return "UserAdminDto{" + '\'' +
                "userid=" + userId + '\'' +
                "intraId=" + intraId + '\'' +
                ", racketType=" + racketType +
                ", statusMessage='" + statusMessage + '\'' +
                ", wins='" + wins + '\'' +
                ", losses'" + losses + '\'' +
                ", ppp=" + ppp + '\'' +
                ", eMail=" + eMail + '\'' +
                ", roleType=" + roleType +
                '}';
    }
}
