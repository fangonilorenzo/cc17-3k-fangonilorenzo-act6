package com.example.a30daysofbasketballtraining.data

import com.example.a30daysofbasketballtraining.R
import com.example.a30daysofbasketballtraining.model.Basketball

class Datasource {
    fun loadBasketball(): List<Basketball> {
        return listOf<Basketball> (
            Basketball(R.string.day1,R.drawable.dribble1),
            Basketball(R.string.day2,R.drawable.shooting2),
            Basketball(R.string.day3,R.drawable.passing3),
            Basketball(R.string.day4,R.drawable.defensivestance4),
            Basketball(R.string.day5,R.drawable.layups5),
            Basketball(R.string.day6,R.drawable.footwork6),
            Basketball(R.string.day7,R.drawable.ft7),
            Basketball(R.string.day8,R.drawable.agility8),
            Basketball(R.string.day9,R.drawable.rebounding9),
            Basketball(R.string.day10,R.drawable.ballhandling10),
            Basketball(R.string.day11,R.drawable.offdribble11),
            Basketball(R.string.day12,R.drawable.condtioning12),
            Basketball(R.string.day13,R.drawable.defensivedrill13),
            Basketball(R.string.day14,R.drawable.midrangeshooting14),
            Basketball(R.string.day15,R.drawable._pointshooting15),
            Basketball(R.string.day16,R.drawable.passingunderpressure16),
            Basketball(R.string.day17,R.drawable.offensivemove17),
            Basketball(R.string.day18,R.drawable.courtawareness18),
            Basketball(R.string.day19,R.drawable.weakhand19),
            Basketball(R.string.day20,R.drawable.shootingconsistency20),
            Basketball(R.string.day21,R.drawable.defensiveawareness21),
            Basketball(R.string.day22,R.drawable.pickandroll22),
            Basketball(R.string.day23,R.drawable.fastbreak23),
            Basketball(R.string.day24,R.drawable.offball24),
            Basketball(R.string.day25,R.drawable.shootingunderpressure25),
            Basketball(R.string.day26,R.drawable.postmoves26),
            Basketball(R.string.day27,R.drawable.playmaking27),
            Basketball(R.string.day28,R.drawable.defensiveintensity28),
            Basketball(R.string.day29,R.drawable.gamesimulation29),
            Basketball(R.string.day30,R.drawable.image1)
        )
    }
}