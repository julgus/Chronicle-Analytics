package net.openhft.chronicle.analytics.internal;

import net.openhft.chronicle.analytics.Analytics;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

final class MuteAnalytics implements Analytics {

    @Override
    public void sendEvent(@NotNull String name, @NotNull Map<String, String> additionalEventParameters) {}
}