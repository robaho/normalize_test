package org.test;


import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread)
public class NormalizerJMH {

    @Param({"CONTENT_LENGTH", "Content-length", "Content-Length"})
    private String testString;

    @Benchmark
    public void benchmarkNormalizeJDK(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeJDK(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption1(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption1(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption2(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption2(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption3(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption3(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption4(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption4(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption5(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption5(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption6(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption6(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption7(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption7(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption8(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption8(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption9(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption9(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption10(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption10(testString));
    }
    @Benchmark
    public void benchmarkNormalizeOption11(Blackhole blackhole) {
        blackhole.consume(Normalizer.normalizeOption11(testString));
    }
    
}