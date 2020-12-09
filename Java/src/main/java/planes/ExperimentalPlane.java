package planes;

import enums.ClassificationLevel;
import enums.ExperimentalType;

import java.util.Objects;

public class ExperimentalPlane extends Plane {
    private ExperimentalType experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model,
      int maxSpeed,
      int maxFlightDistance,
      int maxLoadCapacity,
      ExperimentalType experimentalType,
      ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public ExperimentalType getExperimentalType() {
        return experimentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExperimentalPlane)) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane that = (ExperimentalPlane) o;
        return experimentalType == that.experimentalType &&
                classificationLevel == that.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalType, classificationLevel);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", experimentalType=" + getExperimentalType() +
                        ", classificationLevel=" + getClassificationLevel() +
                        '}');
    }
}