package _6_ke_thua.baitap.class_point2D_and_class_point3D;

public class Point3D extends Point2D {
        private float z;

        public Point3D(){}

        public Point3D(float x, float y, float z){
            setXY(x,y);
            this.z= z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public void setXYZ(float x, float y, float z){
            setXY(x,y);
            this.z= z;
        }

        public float[] getXYZ(){
            float[] res= {getX(), getY(), getZ()};
            return res;
        }

        @Override
        public String toString() {
            return "Point3D{ x="+ getY()+ " y= "+ getY() +
                    " z=" + z +
                    '}';
        }
}
