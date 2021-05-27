/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateareas;

/**
 *
 * @author A
 */
public class circle implements shape{
        private final double radius;
    final double pi = Math.PI;

    public circle() {
        this(1);
    }   
    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }   
}

