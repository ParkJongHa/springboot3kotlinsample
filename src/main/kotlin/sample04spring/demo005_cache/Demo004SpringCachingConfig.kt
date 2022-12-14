package sample04spring.demo005_cache

import org.springframework.cache.CacheManager
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cache.concurrent.ConcurrentMapCacheManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableCaching
class Demo004SpringCachingConfig {

    @Bean
    fun cacheManager(): CacheManager {
        return ConcurrentMapCacheManager("demo004_cache")
    }

}