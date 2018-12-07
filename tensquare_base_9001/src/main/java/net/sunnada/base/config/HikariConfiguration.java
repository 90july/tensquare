package net.sunnada.base.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("spring.datasource")
public class HikariConfiguration
{
//    dataSource.cachePrepStmts = true
//    dataSource.prepStmtCacheSize = 250
//    dataSource.prepStmtCacheSqlLimit = 2048
//    dataSource.useServerPrepStmts = true
//    dataSource.useLocalSessionState = true
//    dataSource.rewriteBatchedStatements = true
//    dataSource .cacheResultSetMetadata = true
//    dataSource.cacheServerConfiguration = true
//    dataSource.elideSetAutoCommits = true
//    dataSource.maintainTimeStats = false
}
