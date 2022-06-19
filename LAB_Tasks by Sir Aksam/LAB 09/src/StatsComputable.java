import javax.management.InvalidAttributeValueException;

public interface StatsComputable {
    final String units = "KM^2";
    void computeStats();
    void reset();
}
