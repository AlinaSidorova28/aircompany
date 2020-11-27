package entity.plane;

import entity.type.ClassificationLevel;
import entity.type.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane {
    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperimentalPlane)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        ExperimentalPlane plane = (ExperimentalPlane) o;
        return type == plane.type &&
                classificationLevel == plane.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, classificationLevel);
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "model='" + super.getModel() + '\'' +
                '}';
    }
}
