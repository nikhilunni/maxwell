package com.zendesk.maxwell.monitoring;

import com.codahale.metrics.MetricRegistry;

public interface Metrics {
	String metricName(String... names);
	MetricRegistry getRegistry();
}

