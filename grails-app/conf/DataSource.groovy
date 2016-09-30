dataSource {
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://localhost/grails_db?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = ""
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
        }
    }
    production {
        dataSource {
          dbCreate = "update"
          driverClassName = 'com.mysql.jdbc.Driver'
          dialect = org.hibernate.dialect.MySQL5InnoDBDialect

          String host = System.getenv('MYSQL_DB_HOST')
          String port = System.getenv('MYSQL_DB_PORT')
          String dbName = System.getenv('MYSQL_DB_NAME')

          url = "jdbc:mysql://$host:$port/$dbName"

          username = System.getenv('MYSQL_DB_USERNAME')
          password = System.getenv('MYSQL_DB_PASSWORD')
       }
    }
}
