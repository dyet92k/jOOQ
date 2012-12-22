/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_71Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Short>, org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71 {

	private static final long serialVersionUID = 2070958443;

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_71.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_71.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.ID);
	}

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	@Override
	public void setTestCase_64_69Id(java.lang.Short value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.h2.generatedclasses.tables.records.XTestCase_64_69Record}
	 */
	public void setTestCase_64_69Id(org.jooq.test.h2.generatedclasses.tables.records.XTestCase_64_69Record value) {
		if (value == null) {
			setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, null);
		}
		else {
			setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, value.getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID, Short.class));
		}
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	@Override
	public java.lang.Short getTestCase_64_69Id() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>PUBLIC.X_TEST_CASE_2025</code> referencing this <code>PUBLIC.X_TEST_CASE_71</code>
	 */
	public org.jooq.Result<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record> fetchXTestCase_2025List() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025)
			.where(org.jooq.test.h2.generatedclasses.tables.XTestCase_2025.REF_ID.equal(getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.ID)))
			.fetch();
	}

	/**
	 * Fetch a record from <code>PUBLIC.X_TEST_CASE_64_69</code> referenced from <code>PUBLIC.X_TEST_CASE_71</code> through <code>PUBLIC.FK_X_TEST_CASE_71</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.records.XTestCase_64_69Record fetchXTestCase_64_69() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID.equal(getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, Integer.class)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_71.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getTestCase_64_69Id();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71 from) {
		setId(from.getId());
		setTestCase_64_69Id(from.getTestCase_64_69Id());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}
}
