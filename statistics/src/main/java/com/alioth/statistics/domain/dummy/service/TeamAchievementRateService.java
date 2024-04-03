package com.alioth.statistics.domain.dummy.service;

import com.alioth.statistics.domain.member.domain.SalesMembers;
import com.alioth.statistics.domain.team.domain.Team;

import java.util.Map;

public interface TeamAchievementRateService {
    Map<Team, String> achievementRatePercent();
    Map<Team, String> achievementRateCount();
}