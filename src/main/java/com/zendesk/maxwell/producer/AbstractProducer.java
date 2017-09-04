package com.zendesk.maxwell.producer;

import com.codahale.metrics.Meter;
import com.zendesk.maxwell.MaxwellContext;
import com.zendesk.maxwell.monitoring.MaxwellDiagnostic;
import com.zendesk.maxwell.row.RowMap;
import com.zendesk.maxwell.util.StoppableTask;

public abstract class AbstractProducer {
	protected final MaxwellContext context;
	protected final MaxwellOutputConfig outputConfig;

	public AbstractProducer(MaxwellContext context) {
		this.context = context;
		this.outputConfig = context.getConfig().outputConfig;
	}

	abstract public void push(RowMap r) throws Exception;

	public StoppableTask getStoppableTask() {
		return null;
	}

	public Meter getFailedMessageMeter() {
		return null;
	}

	public MaxwellDiagnostic getDiagnostic() {
		return null;
	}
}
