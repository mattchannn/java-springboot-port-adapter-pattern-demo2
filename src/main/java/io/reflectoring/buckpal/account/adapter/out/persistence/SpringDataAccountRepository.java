package io.reflectoring.buckpal.account.adapter.out.persistence;

import io.reflectoring.buckpal.account.adapter.out.persistence.entity.AccountJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface SpringDataAccountRepository extends JpaRepository<AccountJpaEntity, Long> {
}
