package com.quntity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.quntity.QuantityFactory.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Nested
    class FeetTest {
        @Test
        void givenZeroFeetAndZeroFeet_whenCompare_TheyShouldBeEqual() {
            AddableQuantity anotherZeroLength = createFeet(0);
            final AddableQuantity zeroFoot = createFeet(0);

            assertTrue(anotherZeroLength.equals(zeroFoot));
        }

        @Test
        void givenZeroFeetAndAAnotherObject_whenCompare_TheyShouldNotBeEqual() {

            assertFalse(createFeet(0).equals(new Object()));
        }

        @Test
        void givenOneFeetAndTwoFeet_whenCompare_TheyShouldNotBeEqual() {
            AddableQuantity oneLength = createFeet(1);
            AddableQuantity twoLength = createFeet(2);

            assertFalse(oneLength.equals(twoLength));
        }

        @Test
        void givenZeroFeetAndNull_whenCompare_TheyShouldNotBeEqual() {

            AddableQuantity zeroLength = createFeet(1);

            assertFalse(zeroLength.equals(null));

        }

    }

    @Nested
    class InchTest {
        AddableQuantity withZero = createInch(0);

        @Test
        void givenZeroInchAndZeroInch_whenCheckEquality_theyShouldBeEqual() {
            AddableQuantity withAnotherZero = createInch(0);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroInchAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroInchAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(createInch(1)));
        }

        @Test
        void givenZeroInchAndNull_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(null));
        }
    }

    @Nested
    class ConversionTest {
        @Test
        void givenOneInchAndOneFeet_whenCheckEquality_thenShouldNotBeEqual() {
            AddableQuantity oneInch = createInch(1);
            AddableQuantity oneFeet = createFeet(1);

            assertFalse(oneFeet.equals(oneInch));
        }

        @Test
        void givenZeroFeetAndZeroInch_whenCheckEquality_thenShouldBeEqual() {
            AddableQuantity zeroInch = createInch(0);
            AddableQuantity zeroFeet = createFeet(0);

            assertTrue(zeroFeet.equals(zeroInch));
        }

        @Test
        void givenOneFeetAndTwelveInch_whenCheckEquality_theShouldBeEqual() {
            AddableQuantity twelveInch = createInch(12);
            AddableQuantity oneFeet = createFeet(1);

            assertEquals(oneFeet, twelveInch);
        }

        @Test
        void givenTwoFeetAndTwentyFourInch_whenCheckEquality_theyShouldBeEqual() {
            AddableQuantity twentyFourInch = createInch(24);
            AddableQuantity twoFeet = createFeet(2);

            assertEquals(twoFeet, twentyFourInch);
        }

        @Test
        void givenTwelveInchAndOneFeet_whenCheckEquality_theyShouldbeEqual() {
            AddableQuantity twelveInch = createInch(12);
            AddableQuantity oneFeet = createFeet(1);

            assertEquals(twelveInch, oneFeet);
        }

        @Test
        void givenOneYardAndOneFeet_whenCheckEquality_thenShouldNotBeEqual() {
            AddableQuantity oneYard = createYard(1);
            AddableQuantity oneFeet = createFeet(1);

            assertFalse(oneFeet.equals(oneYard));
        }

        @Test
        void givenOneYardAndThreeFeet_whenCheckEquality_thenShouldBeEqual() {
            AddableQuantity oneYard = createYard(1);
            AddableQuantity threeFeet = createFeet(3);

            assertFalse(threeFeet.equals(oneYard));
        }

        @Test
        void givenOneGallonAndThreePointSeventyEightLiter_whenCheckEquality_thenShouldBeEqual() {
            AddableQuantity oneGallon = createGallon(1);
            AddableQuantity threePointSeventyEightLiter = createLiter(3.78);

            assertTrue(oneGallon.equals(threePointSeventyEightLiter));
        }

    }

    @Nested
    class GallonAndLiter {

        @Test
        void givenOneGallonAndOneLiter_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneGallon = createGallon(1);
            AddableQuantity oneLiter = createLiter(1);

            assertFalse(oneGallon.equals(oneLiter));
        }

        @Test
        void givenOneFeetAndOneGallon_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneFeet = createFeet(1);
            AddableQuantity oneGallon = createGallon(1);

            assertNotEquals(oneGallon, oneFeet);
        }

        @Test
        void givenOneInchAndOneLiter_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneInch = createInch(1);
            AddableQuantity oneLiter = createLiter(1);

            assertFalse(oneInch.equals(oneLiter));
        }

        @Test
        void givenOneLiterAndOneInch_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneLiter = createLiter(1);
            AddableQuantity oneInch = createInch(1);

            assertFalse(oneLiter.equals(oneInch));
        }

        @Test
        void givenOneGallonAndOneLiter_whenAdd_theyShouldReturnFourPointSevenEightLiter() throws IllegalArgumentException {

            AddableQuantity oneGallon = createGallon(1);
            AddableQuantity oneLiter = createLiter(1);

            assertEquals(createLiter(4.78), oneGallon.add(oneLiter));
        }


    }

    @Nested
    class UnitException {
        @Test
        void givenOneGallonAndOneFeet_whenAdded_theyShouldNotBeAdd() {
            AddableQuantity oneGallon = createGallon(1);
            AddableQuantity oneFeet = createFeet(1);

            IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
                oneGallon.add(oneFeet);
            });

            assertEquals(Measurement.VOLUME + " AND " + Measurement.LENGTH + " NOT VALID FOR ADD OPERATION ", thrown.getMessage());
        }

        @Test
        void givenOneFeetAndOneGallon_whenAdded_theyShouldNotBeAdd() {
            AddableQuantity oneFeet = createFeet(1);
            AddableQuantity oneGallon = createGallon(1);

            IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
                oneFeet.add(oneGallon);
            });

            assertEquals(Measurement.LENGTH + " AND " + Measurement.VOLUME + " NOT VALID FOR ADD OPERATION ", thrown.getMessage());
        }

        @Test
        void givenOneKiloGramAndOneFeet_whenAdded_theyShouldNotBeAdd() {
            AddableQuantity oneKiloGram = createKilogram(1);
            AddableQuantity oneFeet = createFeet(1);

            IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
                oneKiloGram.add(oneFeet);
            });

            assertEquals(Measurement.WEIGHT + " AND " + Measurement.LENGTH + " NOT VALID FOR ADD OPERATION ", thrown.getMessage());
        }

        @Test
        void givenOneFeetAndOneKiloGram_whenAdded_theyShouldNotBeAdd() {
            AddableQuantity oneFeet = createFeet(1);
            AddableQuantity oneKiloGram = createKilogram(1);

            IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
                oneFeet.add(oneKiloGram);
            });

            assertEquals(Measurement.LENGTH + " AND " + Measurement.WEIGHT + " NOT VALID FOR ADD OPERATION ", thrown.getMessage());
        }

    }

    @Nested
    class YardTest {
        AddableQuantity withZero = createYard(0);

        @Test
        void givenZeroYardAndZeroYard_whenCheckEquality_theyShouldBeEqual() {
            AddableQuantity withAnotherZero = createYard(0);

            assertTrue(withZero.equals(withAnotherZero));
        }

        @Test
        void givenZeroYardAndAnotherObject_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(new String()));
        }

        @Test
        void givenZeroYardAndOneYard_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(createYard(1)));

        }

        @Test
        void givenZeroYardAndNull_whenCheckEquality_theyShouldNotBeEqual() {

            assertFalse(withZero.equals(null));
        }
    }

    @Nested
    class AddLengths {

        @Test
        void givenZeroInchAndZeroInch_whenAdd_theyShouldAdd() throws IllegalArgumentException {

            AddableQuantity zeroInch = createInch(0);
            AddableQuantity anotherZeroInch = createInch(0);
            assertEquals(createInch(0), zeroInch.add(anotherZeroInch));
        }

        @Test
        void givenOneInchAndOneInch_whenAdd_theyShouldAdd() throws IllegalArgumentException {

            AddableQuantity oneInch = createInch(1);
            AddableQuantity anotherOneInch = createInch(1);

            assertEquals(createInch(2.0), oneInch.add(anotherOneInch));
        }

        @Test
        void givenTwoInchAndTwoInch_whenAdd_theyShouldAdd() throws IllegalArgumentException {

            AddableQuantity twoInch = createInch(2);
            AddableQuantity anotherTwoInch = createInch(2);

            assertEquals(createInch(4.0), twoInch.add(anotherTwoInch));
        }

        @Test
        void givenOneFeetAndTwoInch_whenAdd_theyShouldReturnFourteen() throws IllegalArgumentException {

            AddableQuantity oneFeet = createFeet(1);
            AddableQuantity anotherTwoInch = createInch(2);

            assertEquals(createInch(14.0), oneFeet.add(anotherTwoInch));
        }

        @Test
        void givenOneInchAndOneFeet_whenAdd_theyShouldReturnOneThree() throws IllegalArgumentException {

            AddableQuantity oneFeet = createFeet(1);
            AddableQuantity oneInch = createInch(1);

            assertEquals(createInch(13.0), oneInch.add(oneFeet));
        }
    }

    @Nested
    class KiloGramTest {
        @Test
        void givenZeroKiloGramAndZeroKiloGram_whenCheckEquality_TheyShouldBeEqual() {
            AddableQuantity zeroKiloGram = createKilogram(0);
            AddableQuantity anotherKiloGram = createKilogram(0);

            assertEquals(zeroKiloGram, anotherKiloGram);
        }

        @Test
        void givenZeroKiloGramAndAnotherObject_whenCheckEquality_TheyShouldNotBeEqual() {

            assertNotEquals(createKilogram(0), new Object());
        }

        @Test
        void givenOneKiloGramAndTwoKiloGram_whenCheckEquality_TheyShouldNotBeEqual() {
            AddableQuantity oneKiloGram = createKilogram(1);
            AddableQuantity twoKiloGram = createKilogram(2);

            assertFalse(oneKiloGram.equals(twoKiloGram));
        }

        @Test
        void givenOneKiloGramAndNull_whenCheckEquality_TheyShouldNotBeEqual() {
            AddableQuantity oneKiloGram = createKilogram(1);

            assertFalse(oneKiloGram.equals(null));
        }
    }

    @Nested
    class GramTest {
        @Test
        void givenZeroGramAndZeroGram_whenCheckEquality_TheyShouldBeEqual() {
            AddableQuantity zeroGram = createGram(0);
            AddableQuantity anotherGram = createGram(0);

            assertEquals(zeroGram, anotherGram);
        }

        @Test
        void givenZeroGramAndAnotherObject_whenCheckEquality_TheyShouldNotBeEqual() {

            assertNotEquals(createGram(0), new Object());
        }

        @Test
        void givenOneGramAndTwoGram_whenCheckEquality_TheyShouldNotBeEqual() {
            AddableQuantity oneGram = createGram(1);
            AddableQuantity twoGram = createGram(2);

            assertFalse(oneGram.equals(twoGram));
        }

        @Test
        void givenOneGramAndNull_whenCheckEquality_TheyShouldNotBeEqual() {
            AddableQuantity oneGram = createGram(1);

            assertFalse(oneGram.equals(null));
        }
    }

    @Nested
    class KiloGramAndGramEqualityTest {
        @Test
        void givenOneKiloGramAndOneGram_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneKiloGram = createKilogram(1);
            AddableQuantity oneGram = createGram(1);

            assertFalse(oneKiloGram.equals(oneGram));
        }

        @Test
        void givenOneFeetAndOneKiloGram_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneFeet = createFeet(1);
            AddableQuantity oneKiloGram = createKilogram(1);

            assertNotEquals(oneFeet, oneKiloGram);
        }

        @Test
        void givenOneLiterAndOneGram_whenCheckEquality_theyShouldNotBeEqual() {
            AddableQuantity oneLiter = createLiter(1);
            AddableQuantity oneGram = createGram(1);

            assertNotEquals(oneLiter, oneGram);
        }

        @Test
        void givenOneKiloGramAndOneThousandGram_whenCheckEquality_theyShouldBeEqual() {
            AddableQuantity oneKiloGram = createKilogram(1);
            AddableQuantity oneGram = createGram(1000);

            assertEquals(oneKiloGram, oneGram);
        }

        @Test
        void givenOneThousandGramAndOneKiloGram_whenCheckEquality_theyShouldBeEqual() {
            AddableQuantity oneGram = createGram(1000);
            AddableQuantity oneKiloGram = createKilogram(1);

            assertEquals(oneGram, oneKiloGram);
        }
    }

    @Nested
    class KiloGramAndGramAddingTest {
        @Test
        void givenZeroKiloGramAndZeroKiloGram_whenAdd_theyShouldBeAdd() {
            AddableQuantity zeroKiloGram = createKilogram(0);
            AddableQuantity anotherKiloGram = createKilogram(0);

            assertEquals(createKilogram(0), zeroKiloGram.add(anotherKiloGram));
        }

        @Test
        void givenOneKiloGramAndOneKiloGram_whenAdd_theyShouldBeAdd() {
            AddableQuantity oneKiloGram = createKilogram(1);
            AddableQuantity anotherKiloGram = createKilogram(1);

            assertEquals(createGram(2000), oneKiloGram.add(anotherKiloGram));
        }

        @Test
        void givenOneKiloGramAndOneGram_whenAdd_theyShouldBeAdd() {
            AddableQuantity oneKiloGram = createKilogram(1);
            AddableQuantity oneGram = createGram(1);

            assertEquals(createGram(1001), oneKiloGram.add(oneGram));
        }

        @Test
        void givenZeroGramAndZeroGram_whenAdd_theyShouldBeAdd() {
            AddableQuantity zeroGram = createGram(0);
            AddableQuantity anotherZeroGram = createGram(0);

            assertEquals(createGram(0), zeroGram.add(anotherZeroGram));
        }

        @Test
        void givenOneGramAndOneGram_whenAdd_theyShouldBeAdd() {
            AddableQuantity oneGram = createGram(1);
            AddableQuantity anotherOneGram = createGram(1);

            assertEquals(createGram(2), oneGram.add(anotherOneGram));
        }

        @Test
        void givenOneGramAndOneKiloGram_whenAdd_theyShouldBeAdd() {
            AddableQuantity oneGram = createGram(1);
            AddableQuantity oneKiloGram = createKilogram(1);

            assertEquals(createGram(1001), oneGram.add(oneKiloGram));
        }

    }

  }
