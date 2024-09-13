package io.reflectoring.buckpal.account.application.port.in;

import io.reflectoring.buckpal.account.application.port.in.command.SendMoneyCommand;

public interface SendMoneyUseCase {

	boolean sendMoney(SendMoneyCommand command);

}
