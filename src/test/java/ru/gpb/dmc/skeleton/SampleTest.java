package ru.gpb.dmc.skeleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

@Slf4j
public class SampleTest {

    @Test
    public void sampleTest() {
        log.info("Sample test");
        Assert.isTrue(true, "true");
    }

}
