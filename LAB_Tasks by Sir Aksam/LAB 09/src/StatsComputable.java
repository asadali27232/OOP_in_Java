public interface StatsComputable {
    final String units = "KM^20";
    void computeStats();
    void reset();
}
