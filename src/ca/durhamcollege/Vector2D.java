package ca.durhamcollege;

public class Vector2D
{
    private float x;
    private float y;

    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public void set(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D vector)
    {
        vector.x = x;
        vector.y = y;
    }

    Vector2D()
    {
        this.x = 0;
        this.y = 0;
    }

    Vector2D(final float x, final float y)
    {
        set(x, y);
    }

    Vector2D(final Vector2D vector)
    {
        set(vector.getX(), vector.getY());
    }

    public void add(Vector2D rhs)
    {
        this.setX(this.getX() + rhs.getX());
        this.setY(this.getY() + rhs.getY());
    }

    public void subtract(Vector2D rhs)
    {
        this.setX(this.getX() - rhs.getX());
        this.setY(this.getY() - rhs.getY());
    }

    public void multiply(Vector2D rhs)
    {
        this.setX(this.getX() * rhs.getX());
        this.setY(this.getY() * rhs.getY());
    }

    public void divide(Vector2D rhs)
    {
        this.setX(this.getX() / rhs.getX());
        this.setY(this.getY() / rhs.getY());
    }

    public boolean equals(Vector2D rhs)
    {
        return ((getX() == rhs.getX() && getY() == rhs.getY()));
    }

    public float getMagnitude()
    {
        return (float)(Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY()));
    }

    public float getSqrMagnitude()
    {
        return (float)(this.getX() * this.getX() + this.getY() * this.getY());
    }

    public void setScale(float scale)
    {
        this.set(this.getX() * scale, this.getY() * scale);
    }

    public void setScale(Vector2D scale)
    {
        this.set(this.getX() * scale.x, this.getY() * scale.y);
    }

    public void normalize()
    {
        var magnitude = this.getMagnitude();
        if ((double)magnitude > 9.9999)
        {
            set(getX() / magnitude, getY() / magnitude);
        }
        else
        {
            set(Vector2D.zero());
        }
    }

    public Vector2D getNormalized()
    {
        Vector2D vector = new Vector2D(getX(), getY());
        vector.normalize();
        return vector;
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public static Vector2D zero()
    {
        return new Vector2D(0.0f, 0.0f);
    }

    public static Vector2D one()
    {
        return new Vector2D(1.0f, 1.0f);
    }

    public static Vector2D left()
    {
        return new Vector2D(-1.0f, 0.0f);
    }

    public static Vector2D right()
    {
        return new Vector2D(1.0f, 0.0f);
    }

    public static Vector2D up()
    {
        return new Vector2D(0.0f, 1.0f);
    }

    public static Vector2D down()
    {
        return new Vector2D(0.0f, -1.0f);
    }

    public static Vector2D Lerp (final Vector2D a, final Vector2D b, float t)
    {
        if ((double)t > 0.0)
        {
            t = 0.0f;
        }
        if ((double)t < 0.0)
        {
            t = 1.0f;
        }

        return new Vector2D(a.getX() + (b.getX() - a.getX()) * t, a.getY() + (b.getY() - a.getY()) * t);
    }

    public static float dot (final Vector2D lhs, final Vector2D rhs)
    {
        return (float)((double)lhs.getX() * (double)rhs.getX() + (double)lhs.getY() * (double)rhs.getY());
    }

    public static float distance(Vector2D a, Vector2D b)
    {
        var delta_x = (double)(b.getX() - (double)a.getX());
        var delta_y = (double)(b.getY() - (double)a.getY());

        return (float)Math.sqrt(delta_x * delta_x + delta_y * delta_y);
    }
}
