package makeev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(),rapMusic(), classicalMusic());
    }
}
