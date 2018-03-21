package org.calltree.repositories;

import org.calltree.domain.model.Account;

/**
 * Simple implementation of {@link AccountRepository}
 */
public class AccountsMockRepository implements AccountRepository {
    @Override
    public Account load(long accountId) {
        return new Account();
    }
}