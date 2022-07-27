package com.dababy.dinosauria.entity.ai;

import com.dababy.dinosauria.entity.TamableDino;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.Level;

public class NocturnalSleepGoal extends Goal {

    public TamableDino entity;

    public NocturnalSleepGoal(TamableDino sleeper) {
        super();
        this.entity = sleeper;
    }


    @Override
    public boolean canUse() {
        return false;
    }

    @Override
    public boolean canContinueToUse() {
        Level world = entity.level;
        if (world.getDayTime() >= 12000 && world.getDayTime() < 24000 || entity.getLastHurtByMob() != null || entity.getTarget() != null || entity.isTame() || entity.isInPowderSnow || entity.isInWater()) {
            stop();
            return false;
        } else return true;
    }

    @Override
    public void start() {
        entity.setAsleep(true);
        entity.getNavigation().stop();
    }

    public void tick() {
        super.tick();
        Level world = entity.level;
        if (world.getDayTime() >= 12000 && world.getDayTime() < 24000 || entity.getLastHurtByMob() != null || entity.getTarget() != null || entity.isTame() || entity.isInPowderSnow || entity.isInWater()) {
            stop();
        }
    }

    @Override
    public void stop() {
        entity.setAsleep(false);
    }
}

