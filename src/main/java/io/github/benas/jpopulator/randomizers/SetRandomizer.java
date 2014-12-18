/*
 * The MIT License
 *
 *   Copyright (c) 2014, Mahmoud Ben Hassine (md.benhassine@gmail.com)
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */
package io.github.benas.jpopulator.randomizers;

import io.github.benas.jpopulator.api.Randomizer;

import java.util.HashSet;
import java.util.Set;

/**
 * A custom randomizer that generates a set of random values from another {@link Randomizer}.
 *
 * @author Eric Taix (eric.taix@gmail.com)
 */
public class SetRandomizer<T> extends ListRandomizer<T> {

    /**
     * Default constructor which will generate a set with a random number of element.
     * Each element is generated by the {@link Randomizer} parameter
     *
     * @param elementRandomizer the randomizer to use to generate random elements of the set
     */
    public SetRandomizer(Randomizer<T> elementRandomizer) {
        super(elementRandomizer);
    }

    /**
     * Constructor which will generate a set with a fixed number of elements.
     * Each element is generated by the {@link Randomizer} parameter
     *
     * @param elementRandomizer The randomizer used to generate each element
     * @param nb                The number of elements in the set to generate
     */
    public SetRandomizer(Randomizer<T> elementRandomizer, int nb) {
        super(elementRandomizer, nb);
    }

    /**
     * Constructor which will generate a set with a random number of elements.
     * Each element is generated by the {@link Randomizer} parameter
     *
     * @param elementRandomizer The randomizer used to generate each element
     * @param min               The minimum number of elements in the set to generate
     * @param max               The maximum number of elements in the set to generate
     */
    public SetRandomizer(Randomizer<T> elementRandomizer, int min, int max) {
        super(elementRandomizer, min, max);
    }

    @Override
    public Set<T> getRandomValue() {
        return new HashSet<T>(super.getRandomValue());
    }

}
