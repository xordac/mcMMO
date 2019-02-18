package com.gmail.nossr50.core.runnables;

import com.gmail.nossr50.core.runnables.skills.AprilTask;
import com.gmail.nossr50.core.util.Misc;

public class CheckDateTask extends BukkitRunnable {

    @Override
    public void run() {
        if (!mcMMO.getHolidayManager().isAprilFirst()) {
            return;
        }

        // Set up jokes
        new AprilTask().runTaskTimer(mcMMO.p, 1L * 60L * Misc.TICK_CONVERSION_FACTOR, 10L * 60L * Misc.TICK_CONVERSION_FACTOR);
        mcMMO.getHolidayManager().registerAprilCommand();

        // Jokes deployed.
        this.cancel();
    }
}